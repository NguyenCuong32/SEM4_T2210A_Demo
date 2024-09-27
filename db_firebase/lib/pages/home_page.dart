import 'package:db_firebase/pages/new_category.dart';
import 'package:db_firebase/services/firebase_service.dart';
import 'package:firebase_database/ui/firebase_animated_list.dart';
import 'package:flutter/material.dart';

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<StatefulWidget> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  int _categoryCount = 0;
  var _firebase = FirebaseService('categories');
  @override
  void initState() {
    super.initState();
    print('init state');
    _firebase.readStringData();
  }

  void addCategory() async {
    var newCategory = await Navigator.push(context,
        MaterialPageRoute(builder: (ctx) => NewCategory(_categoryCount)));
    if (newCategory == null) {
      print('item is null');
      return;
    } else {
      print('item is not null');
      print(newCategory.toString());
    }
  }

  @override
  Widget build(BuildContext context) {
    int _categoryId = 0;
    return Scaffold(
        appBar: AppBar(
          title: const Text(
            'Categories list',
            style: TextStyle(fontWeight: FontWeight.bold, color: Colors.white),
          ),
          backgroundColor: Colors.green,
          actions: [
            IconButton(onPressed: addCategory, icon: const Icon(Icons.add))
          ],
        ),
        body: FirebaseAnimatedList(
          query: _firebase.ref.child('categories'),
          itemBuilder: (context, snapshot, animation, index) {
            Map category = snapshot.value as Map;
            if (category['categoryId'] > _categoryId) {
              _categoryCount = category['categoryId'];
            }
            print('Count ${_categoryCount}');
            return Dismissible(
                key: ValueKey(category['categoryId'].toString()),
                child: ListTile(
                  title: Text(category['categoryId'].toString()),
                  subtitle: Text(category['title']),
                  trailing: Text(category['quantity'].toString()),
                ));
          },
        ));
  }
}

import 'package:flutter/material.dart';
import 'package:flutter_appdemo_01/models/user.dart';
import 'package:flutter_appdemo_01/services/userservice.dart';

class AboutMe extends StatefulWidget {
  @override
  State<StatefulWidget> createState() => _AboutMeState();
}

class _AboutMeState extends State<AboutMe> {
  List<User> _users = [];
  @override
  void initState() {
    _users = [];
    _users.add(User('Nguyen', 'Nguyen Cuong', 20));
    _users.add(User('Ha', 'Nguyen Ha', 20));
  }

  @override
  Widget build(BuildContext context) {
    Widget body = const Center(child: Text('There is no items.'));
    if (_users != null) {
      body = ListView.builder(
          itemCount: _users.length,
          itemBuilder: ((context, index) => Dismissible(
              key: ValueKey(_users[index]),
              child: ListTile(
                leading: Text(_users[index].name),
                title: Text(_users[index].fullname),
                trailing: Text(_users[index].age.toString()),
              ))));
    }
    return Scaffold(
      appBar: AppBar(
        title: Text('About me'),
      ),
      body: body,
    );
  }
}

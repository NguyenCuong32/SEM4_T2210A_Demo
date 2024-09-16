import 'package:flutter/material.dart';
import 'package:flutter_appdemo_01/models/email.dart';

class HomePage extends StatefulWidget {
  const HomePage({super.key});
  @override
  State<StatefulWidget> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  List<Email> _emailList = [];
  @override
  void initState() {
    _emailList = [];
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
    _emailList.add(
        Email('Cuonng', 'Nguyen Cuong has received some email form ....', 20));
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: DefaultTabController(
          length: 3,
          child: Scaffold(
            appBar: AppBar(
              title: const Text("Home Page"),
              bottom: const TabBar(tabs: [
                Tab(
                  child: Text("Inbox"),
                ),
                Tab(
                  child: Text("Sent"),
                ),
                Tab(
                  child: Text("Contacts"),
                )
              ]),
            ),
            body: TabBarView(children: [
              ListView.builder(
                  itemCount: _emailList.length,
                  itemBuilder: ((context, index) => Dismissible(
                      key: ValueKey(_emailList[index]),
                      child: ListTile(
                        leading: Text(_emailList[index].name),
                        title: Text(_emailList[index].emailShort),
                        trailing: Text(_emailList[index].like.toString()),
                      )))),
              const Text("Email sent"),
              const Text("My name: xxx")
            ]),
          )),
    );
  }
}

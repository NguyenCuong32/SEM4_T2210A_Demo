import 'package:flutter/material.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

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
          )),
    );
  }
}

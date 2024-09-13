import 'package:flutter/material.dart';
import 'package:flutter_appdemo_01/pages/aboutme.dart';
import 'package:flutter_appdemo_01/pages/home.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
      ),
      home: const MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  int _counter = 0;
  int _selectedIndex = 0;
  void _incrementCounter() {
    setState(() {
      _counter++;
    });
  }

  void _onItemTapped(int index) {
    setState(() {
      _selectedIndex = index;
    });
  }

  @override
  Widget build(BuildContext context) {
    List<String> components = <String>['Aptech', 'Skilsing', 'Game'];
    const selectedIndex = 3;
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('List component'),
        ),
        body: ListView.separated(
          itemBuilder: (BuildContext context, int index) {
            return Container(
              height: 64,
              child: Center(
                child: Text('Component ${components[index]}'),
              ),
            );
          },
          separatorBuilder: (BuildContext context, int index) =>
              const Divider(),
          itemCount: components.length,
        ),
        floatingActionButton: FloatingActionButton(
            onPressed: () => {print('Floating Button Press')},
            child: const Text('+')),
        drawer: Drawer(
          child: ListView(
            padding: EdgeInsets.zero,
            children: [
              const SizedBox(
                  height: 64,
                  child: DrawerHeader(
                      child: DecoratedBox(
                    decoration: BoxDecoration(color: Colors.blueGrey),
                    child: Text('Drawer Header'),
                  ))),
              ListTile(
                title: const Text('Home'),
                selected: selectedIndex == 0,
                onTap: () => {
                  Navigator.push(context,
                      MaterialPageRoute(builder: (context) => HomePage()))
                },
              ),
              ListTile(
                title: const Text('Settings'),
                onTap: () => {
                  Navigator.push(context,
                      MaterialPageRoute(builder: (context) => AboutMe()))
                },
              ),
              ListTile(
                title: const Text('About'),
                onTap: () => {
                  Navigator.push(context,
                      MaterialPageRoute(builder: (context) => AboutMe()))
                },
              )
            ],
          ),
        ),
      ),
    );
  }
}

import 'package:dart_oop/models/Person.dart';

class Student extends Person {
  late String name = '';
  Student(super.height, super.weight);
  void showProperties() {
    print("Your properties: $name $height $weight");
  }

  @override
  void running() {
    print("$name running");
  }
}

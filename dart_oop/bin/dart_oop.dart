import 'package:dart_oop/dart_oop.dart' as dart_oop;
import 'package:dart_oop/models/Student.dart';

void main(List<String> arguments) {
  Student student = Student(170, 50);
  student.name = "Nguyen van A";
  student.showProperties();
}

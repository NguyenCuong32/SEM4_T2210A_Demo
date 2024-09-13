import 'package:flutter_appdemo_01/models/user.dart';

class UserService {
  
  List<User> GetUsers() {
    <User>[].add(User("Nguyen", "Nguyen Van A", 20));
    <User>[].add(User('Le', 'Le', 20));
    return <User>[];
  }
}

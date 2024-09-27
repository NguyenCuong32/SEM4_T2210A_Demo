import 'package:firebase_database/firebase_database.dart';

class FirebaseService {
  String _nodeName = '';
  FirebaseService(String nodeName) {
    _nodeName = nodeName;
  }
  var ref = FirebaseDatabase.instance.ref();
  Map<Object, dynamic> _data = {};
  // Read json
  Future<String> readStringData() async {
    await ref.child(_nodeName).once().then((vs) {
      print(vs.snapshot.value.toString());
      return vs.snapshot.value;
    });
    return '';
  }

  void readDataOne() async {
    final ref = FirebaseDatabase.instance.ref();
    final snapshot = await ref.child('users/1').get();
    if (snapshot.exists) {
      print(snapshot.value);
    } else {
      print('No data available.');
    }
  }
  // Read data
  // Update
}

import 'dart:io';

class FileUtil {
  static String readFileAsync() {
    String contents = File('./resources/products.json').readAsStringSync();
    return contents;
  }
}

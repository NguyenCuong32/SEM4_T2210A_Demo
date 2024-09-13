import 'dart:io';

import 'package:web/web.dart' as web;
// import './models/product.dart';

void main() {
  final now = DateTime.now();
  final element = web.document.querySelector('#output') as web.HTMLDivElement;
  element.text = 'The time is ${now.hour}:${now.minute} '
      'and your Dart web app is running!';

  // String content = File(
  //         "/Users/cuongnguyen/Works/3.Education/Sem4/T2210A/dart_web_app_01/web/assets/product.json")
  //     .readAsStringSync();
  // print(content);
  // List<Product> products = JsonUtil.getProducts(json);
  // for (var p in products) {
  //   print(p.name);
  // }
}

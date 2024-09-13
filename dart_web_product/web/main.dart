import 'package:web/web.dart' as web;
import 'models/product.dart';
import 'utils/fileUtil.dart';
import 'dart:convert';

void main() {
  final now = DateTime.now();
  final element = web.document.querySelector('#output') as web.HTMLDivElement;
  element.text = 'The time is ${now.hour}:${now.minute} '
      'and your Dart web app is running!';
  print("Start host");
  String jsonContent = FileUtil.readFileAsync();
  List<Product> products = getListProduct(jsonContent);

  for (var product in products) {
    print("ID: ${product.id}");
    print("Tên: ${product.name}");
    print("Giá: ${product.price}");
    print("Mô tả: ${product.description}");
    print("------------");
  }
  /*Handler Add Product event*/
  // var addButton = web.querySelector('#addProduct');
  // addButton?.onClick.listen((event) {
  //   //Add
  //   products.add(Product(
  //     id: products.length + 1,
  //     name: 'Iphone',
  //     price: 1200.0,
  //     description: 'New version iphone 16',
  //   ));
  // });
}

/*Đọc nội dung file */
List<Product> getListProduct(String jsonContent) {
  List<dynamic> jsonList = jsonDecode(jsonContent);
  List<Product> products = [];

  for (var jsonProduct in jsonList) {
    products.add(Product.fromJson(jsonProduct));
  }
  return products;
}

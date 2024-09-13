import 'dart:io';

// import '../models/product.dart';

class JsonUtil {
  static String readContent() {
    String content = File('./assets/product.json').readAsStringSync();
    return content;
  }

  // static List<Product> getProducts(String json) {
  //   List<dynamic> products = [];
  //   List<Product> listProducts = [];
  //   for (var jsonProduct in products) {
  //     products.add(Product.fromJson(jsonProduct));
  //   }
  //   return listProducts;
  // }
}

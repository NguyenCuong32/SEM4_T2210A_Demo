import 'dart:convert';

import '../models/Product.dart';

class Productservice {
  Product getProduct(String json) {
    final productMap = jsonDecode(json) as Map<String, dynamic>;
    Product product = Product.fromJson(productMap);
    return product;
  }
}

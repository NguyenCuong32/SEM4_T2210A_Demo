import 'package:dart_json/models/Product.dart';
import 'package:dart_json/services/ProductService.dart';

void main(List<String> arguments) {
  String json = '{"productName":"Macbook pro","brand":"Ha noi"}';
  Productservice productservice = Productservice();
  Product product = productservice.getProduct(json);
  print(product.productName);
  print(product.brand);
}

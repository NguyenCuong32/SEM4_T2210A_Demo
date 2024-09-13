class Product {
  late final String productName;
  late final String brand;
  Product(this.productName, this.brand);

  Product.fromJson(Map<String, dynamic> json)
      : productName = json["productName"],
        brand = json["brand"];

  
  Map<String, dynamic> toJson() => {'productName': productName, 'brand': brand};
}

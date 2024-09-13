class Product {
  late final int id;
  late final String name;
  late final double price;
  late final String description;
  Product(
      {required this.id,
      required this.name,
      required this.price,
      required this.description});

  factory Product.fromJson(Map<String, dynamic> json) {
    return Product(
      id: json['id'],
      name: json['name'],
      price: json['price'].toDouble(),
      description: json['description'],
    );
  }
}

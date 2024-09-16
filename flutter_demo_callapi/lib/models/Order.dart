class Order {
  late String id;
  late String customerId;
  late String customerName;
  late String customerPhone;
  late String customerAddress;
  Order(this.id, this.customerId, this.customerName, this.customerPhone,
      this.customerAddress);
  factory Order.fromJson(Map<String, dynamic> json) {
    return Order(json['id'], json['customerId'], json['customerName'],
        json['customerPhone'], json["customerAddress"]);
  }
}

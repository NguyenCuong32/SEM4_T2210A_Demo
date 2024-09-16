import 'package:flutter/material.dart';
import 'package:flutter_demo_callapi/models/Order.dart';
import 'dart:convert';
import 'package:http/http.dart' as http;

class OrderList extends StatefulWidget {
  @override
  State<StatefulWidget> createState() => _OrderListState();
}

class _OrderListState extends State<OrderList> {
  List<Order> _listOrder = [];
  @override
  initState() {
    getOrderList();
    setState(() {

    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Test call api"),
      ),
    );
  }

  void getOrderList() async {
    List<Order> _order = [];
    try {
      final response =
          await http.get(Uri.parse('http://localhost:8080/api/v1/order'));
      if (response.statusCode == 200) {
        print(response.body);
        _order = getListProduct(response.body);
        setState(() {
          _listOrder = _order;
        });
      } else {
        print('Request failed with status: ${response.statusCode}.');
      }
    } catch (e) {
      print(e.toString());
    }
  }

  List<Order> getListProduct(String jsonContent) {
    List<dynamic> jsonList = jsonDecode(jsonContent);
    List<Order> products = [];

    for (var jsonProduct in jsonList) {
      products.add(Order.fromJson(jsonProduct));
    }
    return products;
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vn.programming.algorithm;

/**
 *
 * @author danglph
 */
public class Search {

    int linearSearch(int arr[], int length, int xValue) {
        int i;
        for (i = 0; i < length; i++) {
            if (arr[i] == xValue) // Trả về chỉ số khi tìm thấy
            {
                return i;
            }
        }
        // Nếu không tìm thấy trả về -1. Vì chỉ số mảng phải >= 0
        return -1;
    }

    //binary search đệ quy
    int binarySearch(int arr[], int leftIndex, int rightIndex, int xValue) {
        if (rightIndex >= leftIndex) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2;

            // Nếu arr[mid] = x, trả về chỉ số và kết thúc
            if (arr[mid] == xValue) {
                return mid;
            }

            // Nếu arr[mid] > x, gọi đệ quy tìm kiếm bên trái
            if (arr[mid] > xValue) {
                return binarySearch(arr, leftIndex, mid - 1, xValue);
            }

            // Ngược lại, nếu arr[mid] < x, gọi đệ quy tìm kiếm bên phải
            return binarySearch(arr, mid + 1, rightIndex, xValue);
        }

        // Trong trường hợp không tìm thấy
        return -1;
    }

    // Hàm tìm kiếm nhị phân sử dụng giải thuật đệ quy
    int binarySearch(int arr[], int length, int xValue) {
        int rightIndex = length - 1; // chỉ số phần tử cuối
        int leftIndex = 0; // Chỉ số phần tử đầu tiên
        while (rightIndex >= leftIndex) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2; // Tương đương (l+r)/2 nhưng ưu điểm tránh tràn số khi l,r lớn

            // Nếu arr[mid] = x, trả về chỉ số và kết thúc.
            if (arr[mid] == xValue) {
                return mid;
            }

            // Nếu arr[mid] > x, cập nhật lại right
            if (arr[mid] > xValue) {
                rightIndex = mid - 1;
            }
            // Nếu arr[mid] > x, cập nhật lại left
            else {
                leftIndex = mid + 1;
            }
        }

        // Nếu không tìm thấy
        return -1;
    }
}

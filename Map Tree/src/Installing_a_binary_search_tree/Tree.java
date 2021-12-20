package Installing_a_binary_search_tree;

public interface Tree<E> {
    //Chèn phần tử e vào cây tìm kiếm nhị phân
    //Trả về true nếu phần tử được chèn thành công
    boolean insert(E e);
    //Inorder traversal từ gốc
    void inorder();
    //Nhận số lượng nút trong cây
    int getSize();
}

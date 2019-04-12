package ru.msk.java.pojo;

public class QuickFindUF {

    private int[] id;

    /**
     * Инициализируем массив вершин
     *
     * @param N
     */
    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /** Если в соответствующих индексах массива
     * находятся одинаковые идентификаторы - то
     * вершины считаются соединенными.
     *
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q) {
        return id[p] ==  id[q];
    }

    /**
     * "Соединяем" две вершины, присваивая всем вершинам с
     * pid значение qid.
     *
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}

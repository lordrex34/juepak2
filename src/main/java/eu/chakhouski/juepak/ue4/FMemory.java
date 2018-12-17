package eu.chakhouski.juepak.ue4;

public class FMemory
{
    public static int Memcmp(byte[] a, byte[] b, int size)
    {
        int cmp = 0;

        for (int i = 0; (i < size) && (cmp == 0); i++)
            cmp = Byte.compare(a[i], b[i]);

        return cmp;
    }
}

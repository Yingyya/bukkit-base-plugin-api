package cn.yingyya.bukkit.base.api;

public interface ILevelDB {

	void close();
	byte[] get(byte[] key);
	void put(byte[] key, byte[] value);
}

package cn.yingyya.bukkit.base.api;

import java.util.List;

public interface ILevelDB {

	void close();
	byte[] get(byte[] key);
	void put(byte[] key, byte[] value);

	List<String> getDBInfo();
}

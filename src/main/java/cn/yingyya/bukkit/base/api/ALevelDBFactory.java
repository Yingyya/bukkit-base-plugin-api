package cn.yingyya.bukkit.base.api;

import java.io.File;
import java.io.IOException;

public abstract class ALevelDBFactory {

	public abstract ILevelDB newDatabase(File file) throws IOException;

}

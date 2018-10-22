package cn.tcht.stock.baseService;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.tcht.stock.dal.SuperDAO;


/**
 * @author wangwei@teamsun.com
 * @version V1.0.0
 * @Title: BaseSerivce
 * @Package cn.tfb.stock.provider.service
 * @Description: <p>
 * packaged service common object,method
 * </p>
 * @date 2018/1/8 14:15
 */
@Service("baseService")
public class BaseService {

    @Qualifier("readSuperDao")
    @Resource
    private SuperDAO readSuperDAO;

    @Qualifier("writeSuperDao")
    @Resource
    private SuperDAO writeSuperDAO;

    public SuperDAO getReadSuperDAO() {
        return readSuperDAO;
    }

    public void setReadSuperDAO(SuperDAO readSuperDAO) {
        this.readSuperDAO = readSuperDAO;
    }

    public SuperDAO getWriteSuperDAO() {
        return writeSuperDAO;
    }

    public void setWriteSuperDAO(SuperDAO writeSuperDAO) {
        this.writeSuperDAO = writeSuperDAO;
    }
}

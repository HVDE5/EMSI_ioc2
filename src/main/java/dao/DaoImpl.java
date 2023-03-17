package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{

	@Override
	public double getdata() {
		return Math.random()*100;
	}

}

package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

	@Autowired
	private IDao dao = null;
	@Override
	public double calcul() {
		return dao.getdata()/Math.PI;
	}
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}

package createContainer;

import container.IBag;

public interface IBagFactory {

	IBag makeBag(String type);
}

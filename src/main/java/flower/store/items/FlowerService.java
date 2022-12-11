package flower.store.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    public FlowerRepository flowerRepository;
    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }
    public List<Flower> getFlowers() {
        return this.flowerRepository.findAll();
    }
    public void addFlower(Flower flower) {
        this.flowerRepository.save(flower);
    }
}

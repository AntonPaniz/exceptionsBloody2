public class Suit extends SuitUp{
    @Override
    public void suitUp() {
        throw new EntityNotFoundException(21);
    }
}

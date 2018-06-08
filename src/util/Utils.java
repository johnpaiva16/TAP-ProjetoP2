package util;

import br.com.caelum.stella.validation.CPFValidator;

/**
 *
 * @author jesp
 */
public class Utils {

    public static boolean validaCpf(String cpf) {
        CPFValidator cpfValidator = new CPFValidator();
        return (cpfValidator.invalidMessagesFor(cpf)).isEmpty();
    }
}

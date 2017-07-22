package graphql.execution;

import graphql.GraphQLException;
import graphql.schema.GraphQLType;

/**
 * This is thrown when an argument or variable value fails to parse
 */
public class ValueParsingException extends GraphQLException {

    public ValueParsingException(GraphQLType type, Object value) {
        super(String.format("Invalid value for type: '%s': '%s'", type.getName(), value));
    }
}

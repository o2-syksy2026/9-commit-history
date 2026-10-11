package part02;

import java.util.Collection;
import java.util.Map;

public class Contributors {

    /**
     * Returns the contributors from the given commit log. See the previous exercise
     * or the readme file for more information about the format of the commit log.
     *
     * The returned collection must not contain duplicates. The order of the
     * contributors in the returned collection is not important. If the given commit
     * log is empty, the method should return an empty collection.
     *
     * For example, for the commit log in the readme file, this method should return
     * the following usernames in any order:
     *
     * ["EagerElla", "LoopyLou", "NewbieNate", "ProgPete"]
     *
     * @param commitLog a multi-line string containing the log of commits
     * @return a collection of contributor usernames from the commit log
     */
    public Collection<String> getContributors(String commitLog) {
        // Like in the previous exercise, you need to return an instance of some class
        // that implements the Collection interface. The choice is yours.
        return null;
    }

    /**
     * This method groups the commit ids by contributor. The format of the input is
     * the same as in the previous exercises. The output of this method is a map
     * where the keys are the usernames of the contributors in the log and the keys
     * are collections of commit ids that belong to the specific contributor.
     * The order of the usernames and ids in the returned map is not important.
     *
     * For example, for the commit log in the readme file, this method should return
     * a map containing the following usernames and ids in any order:
     *
     * {
     * "EagerElla": ["4f2a1d", "8h5k2y"],
     * "LoopyLou": ["e6c5b2", "j7i2k9"],
     * "NewbieNate": ["7b9f1e", "1d9g4z", "o1z6x9"],
     * "ProgPete": ["a3d8e7", "m3n5p8"]
     * }
     *
     * @param commitLog a multi-line string containing the log of commits
     * @return a map containing the commit ids grouped by contributor
     */
    public Map<String, Collection<String>> groupCommitIdsByContributors(String commitLog) {
        return null;
    }
}

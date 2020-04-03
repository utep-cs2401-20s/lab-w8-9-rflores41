class AminoAcidLL {
  private char aminoAcid;
  private String[] codons;
  private int[] counts;
  private static AminoAcidLL next = null;

  AminoAcidLL() {
    String data;
    AminoAcidLL next;
  }


  /********************************************************************************************/
  /* Creates a new node, with a given amino acid/codon
   * pair and increments the codon counter for that codon.
   * NOTE: Does not check for repeats!! */
  AminoAcidLL(String inCodon) {
    AminoAcidLL newNode = new AminoAcidLL(inCodon);
    this.inCodon = inCodon;
    this.next = null;
    counts[0]++;
  }

  /********************************************************************************************/
  /* Recursive method that increments the count for a specific codon:
   * If it should be at this node, increments it and stops,
   * if not passes the task to the next node.
   * If there is no next node, add a new node to the list that would contain the codon.
   */
  private void addCodon(String inCodon) {
    if (inCodon != null) {
      counts[1]++;
    } else {
      inCodon.next;
    }
    if (inCodon.next = null) {
      new AminoAcidLL(inCodon);
    }
  }


  /********************************************************************************************/
  /* Shortcut to find the total number of instances of this amino acid */
  private int totalCount() {
    return counts[0];
  }

  /********************************************************************************************/
  /* helper method for finding the list difference on two matching nodes
   *  must be matching, but this is not tracked */
  private int totalDiff(AminoAcidLL inList) {
    return Math.abs(totalCount() - inList.totalCount());
  }


  /********************************************************************************************/
  /* helper method for finding the list difference on two matching nodes
   *  must be matching, but this is not tracked */
  private int codonDiff(AminoAcidLL inList) {
    int diff = 0;
    for (int i = 0; i < codons.length; i++) {
      diff += Math.abs(counts[i] - inList.counts[i]);
    }
    return diff;
  }

  /********************************************************************************************/
  /* Recursive method that finds the differences in **Amino Acid** counts.
   * the list *must* be sorted to use this method */
  public int aminoAcidCompare(AminoAcidLL inList) {
    if (isSorted(inList) == true) {
      return totalDiff(inList);
    } else {
      return 0;
    }
  }

  /********************************************************************************************/
  /* Same ad above, but counts the codon usage differences
   * Must be sorted. */
  public int codonCompare(AminoAcidLL inList) {
    if (isSorted(inList) == true) {
      return codonDiff(inList);
    } else {
      return 0;
    }
  }


  /********************************************************************************************/
  /* Recursively returns the total list of amino acids in the order that they are in in the linked list. */
  public char[] aminoAcidList() {
    if (AminoAcidResources.getAminoAcidFromCodon(inList) != null) {
      return new char[counts[1]];
    }
    return new char[0] {
    }
    ;
  }

  /********************************************************************************************/
  /* Recursively returns the total counts of amino acids in the order that they are in in the linked list. */
  public int[] aminoAcidCounts() {
    if (AminoAcidResources.getCodonListForAminoAcid(inList) != null) {
      return totalCount(inList);
    }
    return new int[0] {
    }
    ;
  }


  /********************************************************************************************/
  /* recursively determines if a linked list is sorted or not */
  public boolean isSorted() {
    if (AminoAcidLL.head == null) return false;
    if (AminoAcidLL.next == null) return false;
    if (AminoAcidLL.next != null) {
      if (codonDiff(AminoAcidLL) == codonDiff(AminoAcidLL.next)) return true;
    }
    return false;
  }


  /********************************************************************************************/
  /* Static method for generating a linked list from an RNA sequence */
  public static AminoAcidLL createFromRNASequence(String inSequence) {
    AminoAcidLL newNode = new AminoAcidLL(inSequence);
    this.inSequence = inSequence;
    this.next = null;
    counts[2]++;
    return null;
  }


  /********************************************************************************************/
  /* sorts a list by amino acid character*/
  public static AminoAcidLL sort(AminoAcidLL inList) {
    AminoAcidLL newNode = new AminoAcidLL(inList);
    if (isSorted(inList)) {
      this.inList = inList;
      this.next = null;
    } else {
      return null;
    }
    return null;
  }
}
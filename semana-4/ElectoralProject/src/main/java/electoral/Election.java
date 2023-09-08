/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electoral;

public class Election {
    private int _numberCandidates;
    private int _numberTables;
    private Candidate _candidates[];
    private TableElectoral _tables[];
    
    public Election(int numberCandidates, int numberTables) {
        _numberCandidates = numberCandidates;
        _numberTables = numberTables;
        _candidates = new Candidate[_numberCandidates];
        _tables = new TableElectoral[_numberTables];
        char name = 'a';
        
        for (int i = 0; i < _candidates.length; i++) {
            _candidates[i] = new Candidate(i, String.valueOf(name));
            
            int number = (char) name;
            number++;
            name = (char) number;
        }
        
        for (int i = 0; i < _tables.length; i++) {
            int numberElectors = (int) (Math.random() * 150) + 50;
            _tables[i] = new TableElectoral(i, getNumberCandidates(), numberElectors);
        }
    }

    public int getNumberCandidates() {
        return _numberCandidates;
    }

    public void setNumberCandidates(int _numberCandidates) {
        this._numberCandidates = _numberCandidates;
    }

    public int getNumberTables() {
        return _numberTables;
    }

    public void setNumberTables(int _numberTables) {
        this._numberTables = _numberTables;
    }

    public Candidate[] getCandidates() {
        return _candidates;
    }

    public void setCandidates(Candidate[] _candidates) {
        this._candidates = _candidates;
    }

    public TableElectoral[] getTables() {
        return _tables;
    }

    public void setTables(TableElectoral[] _tables) {
        this._tables = _tables;
    }
    
    public String voting() {
        for (int m = 0; m < _tables.length; m++) {
            int elector = 1;
            while (elector < _tables[m].getNumberElectors()) {
                int vote = (int) (Math.random() * _numberCandidates);
                _tables[m].toVote(vote);
                elector++;
            }
        }
        return "The electoral process has finished.";
    }
    
    public String consolidated() {
        for (int m = 0; m < _tables.length; m++) {
            for (int c = 0; c < _candidates.length; c++) {
                _candidates[c].addingVotes(_tables[m].quantityVotes(c));
            }
        }
        return "The process of consolidation has finished.";
    }

    public String winner() {
        int major = 0;
        int position = -1;
        for (int i = 0; i < _numberCandidates; i++) {
            if (_candidates[i].getVotes() > major) {
                major = _candidates[i].getVotes();
                position = i;
            }
        }
        String result = "The winner is: " +
            _candidates[position].getName() +
            " with the following votes: " +
            _candidates[position].getVotes();
        return result;
    }
}

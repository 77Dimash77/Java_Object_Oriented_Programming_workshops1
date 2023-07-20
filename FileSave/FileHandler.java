package ru.gb.FINAL.final_famliy_tree.FileSave;
import ru.gb.FINAL.final_famliy_tree.Model.FamilyTree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class FileHandler{
    public  void saveFamilyTree(FamilyTree familyTree, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(familyTree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public FamilyTree loadFamilyTree(String fileName) {
        FamilyTree familyTree = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            familyTree = (FamilyTree) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return familyTree;
    }
}

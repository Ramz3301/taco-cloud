//package com.example.tacocloud.repository;
//
//import com.example.tacocloud.Ingredient;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Optional;
//
//@Repository
//public class JdbcIngredientRepository implements IngredientRepository {
//
//    private JdbcTemplate jdbc;
//
//    @Autowired
//    public JdbcIngredientRepository(JdbcTemplate jdbc) {
//        this.jdbc = jdbc;
//    }
//
//    @Override
//    public <S extends Ingredient> Iterable<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Optional<Ingredient> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public Iterable<Ingredient> findAll() {
//        return jdbc.query("SELECT id, name, type FROM Ingredient",
//                this::mapRowToIngredient);
//    }
//
//    @Override
//    public Iterable<Ingredient> findAllById(Iterable<Long> longs) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(Ingredient entity) {
//
//    }
//
////    @Override
////    public void deleteAllById(Iterable<? extends Long> longs) {
////
////    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Ingredient> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public Ingredient findOne(String id) {
//        return jdbc.queryForObject("SELECT id, name, type FROM Ingredient WHERE id = ?",
//                this::mapRowToIngredient, id);
//    }
//
//    private Ingredient mapRowToIngredient(ResultSet resultSet, int rowNum) throws SQLException {
//        return new Ingredient(
//                resultSet.getString("id"),
//                resultSet.getString("name"),
//                Ingredient.Type.valueOf(resultSet.getString("type")));
//    }
//
//    @Override
//    public Ingredient save(Ingredient ingredient) {
//        jdbc.update(
//                "INSERT INTO Ingredient (id, name, type) VALUES (?, ?, ?)",
//                ingredient.getId(),
//                ingredient.getName(),
//                ingredient.getType().toString());
//        return ingredient;
//    }
//
//}

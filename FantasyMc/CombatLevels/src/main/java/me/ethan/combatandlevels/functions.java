package me.ethan.combatandlevels;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;

import java.util.Random;
import java.util.regex.Pattern;

public class functions {



    public static Pattern pattern = Pattern.compile("§[0-9]{1}");



    public static int number(String str) {
        if (str.contains("§")) {
            str = str.replaceAll(String.valueOf(pattern), " ");
            str = str.replaceAll("[^0-9]+", " ");
            str = str.replaceAll(" ", "");
            return Integer.parseInt(str) * 2;
        }
        return 1;
    }

    public static void Zombie(Entity entity){
        Random random = new Random();
        int mob = random.nextInt(72);
        if(entity.getType().equals(EntityType.ZOMBIE)){
            entity.setCustomNameVisible(true);

            //common
            if(mob >= 0){
                int rank = 1 + random.nextInt(3);
                entity.setCustomName("§7Goblin§f: " + rank);

            }

            //uncommon

            if(mob >= 40 && mob <= 60){
                int rank = 3 + random.nextInt(10);
                entity.setCustomName("§aKobold§f: " + rank);
            }

            if(mob >= 61 && mob <= 70){
                int rank = 6 + random.nextInt(15);
                entity.setCustomName("§aHobGoblin§f: " + rank);
            }


            //rare
            if(mob >= 71){
                int rank = 20 + random.nextInt(10);
                entity.setCustomName("§5Orc§f: " + rank);
            }

        }
    }

    public static void Skeleton(Entity entity) {
        Random random = new Random();
        int mob = random.nextInt(50);
        if (entity.getType().equals(EntityType.SKELETON)) {
            if(mob > 15){
                ItemStack item = new ItemStack(Material.AIR);
                int rank = 4 + random.nextInt(7);
                entity.setCustomNameVisible(true);
                entity.setCustomName("§7Undead§f:" + rank);
                Skeleton undead = (Skeleton) entity;
                undead.getEquipment().setItemInMainHand(item);
            }
            if(mob > 0 && mob <= 10){
                int rank = 15 + random.nextInt(22);

                ItemStack[] Weapons = {new ItemStack(Material.BOW), new ItemStack(Material.IRON_SWORD)};
                ItemStack[] Helmets = {new ItemStack(Material.IRON_HELMET), new ItemStack(Material.LEATHER_HELMET)};
                ItemStack[] Chestplates = {new ItemStack(Material.IRON_CHESTPLATE), new ItemStack(Material.LEATHER_CHESTPLATE)};
                ItemStack[] Leggings = {new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.LEATHER_LEGGINGS)};
                ItemStack[] Boots = {new ItemStack(Material.IRON_BOOTS), new ItemStack(Material.LEATHER_BOOTS)};

                int weapon = random.nextInt(Leggings.length);
                int helmet = random.nextInt(Leggings.length);
                int chestplate = random.nextInt(Leggings.length);
                int legging = random.nextInt(Leggings.length);
                int boot = random.nextInt(Leggings.length);

                entity.setCustomNameVisible(true);
                entity.setCustomName("§aUndead Mercenary§f: " + rank);
                Skeleton undead = (Skeleton) entity;

                undead.getEquipment().setItemInMainHand(Weapons[weapon]);
                undead.getEquipment().setHelmet(Helmets[helmet]);
                undead.getEquipment().setChestplate(Chestplates[chestplate]);
                undead.getEquipment().setLeggings(Leggings[legging]);
                undead.getEquipment().setBoots(Boots[boot]);
            }
            if(mob > 10 && mob <= 15){
                int rank = 35 + random.nextInt(15);
                ItemStack Staff = new ItemStack(Material.STICK);
                ItemStack[] Helmets = {new ItemStack(Material.IRON_HELMET), new ItemStack(Material.LEATHER_HELMET)};
                ItemStack[] Chestplates = {new ItemStack(Material.IRON_CHESTPLATE), new ItemStack(Material.LEATHER_CHESTPLATE)};
                ItemStack[] Leggings = {new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.LEATHER_LEGGINGS)};
                ItemStack[] Boots = {new ItemStack(Material.IRON_BOOTS), new ItemStack(Material.LEATHER_BOOTS)};

                int helmet = random.nextInt(Leggings.length);
                int chestplate = random.nextInt(Leggings.length);
                int legging = random.nextInt(Leggings.length);
                int boot = random.nextInt(Leggings.length);

                entity.setCustomNameVisible(true);
                entity.setCustomName("§5Undead Sorcerer§f: " + rank);
                Skeleton undead = (Skeleton) entity;

                undead.getEquipment().setItemInMainHand(Staff);
                undead.getEquipment().setHelmet(Helmets[helmet]);
                undead.getEquipment().setChestplate(Chestplates[chestplate]);
                undead.getEquipment().setLeggings(Leggings[legging]);
                undead.getEquipment().setBoots(Boots[boot]);
            }
        }
    }

    public static void Pig(Entity entity) {
        Random random = new Random();
        int mob = random.nextInt(100);
        if (entity.getType().equals(EntityType.PIG)) {
            if(mob <= 10){
                entity.setCustomNameVisible(true);
                int rank = 5 + random.nextInt(5);
                entity.setCustomName("§aBoar§f: " + rank);
            }
            if(mob >= 10){
                entity.setCustomNameVisible(true);
                int rank = 1 + random.nextInt(3);
                entity.setCustomName("§7Pig§f: " + rank);
            }
        }
    }

    public static void Sheep(Entity entity) {
        Random random = new Random();
        int rank = 1 + random.nextInt(4);
        if (entity.getType().equals(EntityType.SHEEP)) {
            entity.setCustomNameVisible(true);
            entity.setCustomName("§7Sheep§f: " + rank);
        }
    }


    public static void Cow(Entity entity) {
        Random random = new Random();
        int rank = 1 + random.nextInt(4);
        if (entity.getType().equals(EntityType.COW)) {
            entity.setCustomNameVisible(true);
            entity.setCustomName("§7Cow§f: " + rank);
        }
    }


    public static void Wolf(Entity entity) {
        Random random = new Random();
        int mob = random.nextInt(1000);
        if(mob >= 1) {
            int rank = 1 + random.nextInt(10);
            if (entity.getType().equals(EntityType.WOLF)) {
                entity.setCustomNameVisible(true);
                entity.setCustomName("§7Wolf§f: " + rank);
            }
        }
        if(mob == 0){
            int rank = 20 + random.nextInt(60);
            if (entity.getType().equals(EntityType.WOLF)) {
                entity.setCustomNameVisible(true);
                entity.setCustomName("§0Shadow Wolf§f: " + rank);
            }
        }
    }
    public static void Phantom(Entity entity) {
        Random random = new Random();
        int mob = random.nextInt(100);
        if (entity.getType().equals(EntityType.PHANTOM)) {
            if (mob == 0) {
                entity.setCustomNameVisible(true);
                int rank = 15 + random.nextInt(20);
                entity.setCustomName("§5Griffin§f: " + rank);
                Phantom griffin = (Phantom) entity;

                griffin.setSize(10);

            }
        }
    }

    public static void ShadowPartner(Player player, int lvl) {
        Wolf Shadow = (Wolf) player.getWorld().spawnEntity(player.getLocation(), EntityType.WOLF);
            Shadow.setCustomNameVisible(true);
            Shadow.setCustomName("§0Shadow Wolf§f: " + lvl);
    }
}
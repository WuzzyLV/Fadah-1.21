package info.preva1l.fadah.config;


import com.google.common.collect.ImmutableList;
import info.preva1l.fadah.Fadah;
import info.preva1l.fadah.utils.StringUtils;
import info.preva1l.fadah.utils.config.BasicConfig;
import lombok.AllArgsConstructor;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@SuppressWarnings("unchecked")
public enum Menus {
    // TODO: relocate this to profile config
    MAIN_PROFILE_DESCRIPTION("profile-button.description",
            List.of("&fThis is {0} profile!", "&fHere you will find items from the auction house relating to {1}.")),
    MAIN_FILTER_DIRECTION_NAME("filter.change-direction.name", "&eFilter Direction"), // remove later

    SEARCH_TITLE("search-title", "&9&lAuction House &8> &fSearch"),

    CONFIRM_TITLE("confirm.title", "&9&lAuction House &8> &aConfirm Purchase"),
    CONFIRM_BUTTON_ICON("confirm.confirm.icon", "LIME_CONCRETE"),
    CONFIRM_BUTTON_MODEL_DATA("confirm.confirm.model_data",  0),
    CONFIRM_BUTTON_NAME("confirm.confirm.name", "&a&lCONFIRM"),
    CONFIRM_BUTTON_LORE("confirm.confirm.lore", Collections.singletonList("&7Click to confirm")),
    CANCEL_BUTTON_ICON("confirm.cancel.icon", "RED_CONCRETE"),
    CANCEL_BUTTON_MODEL_DATA("confirm.cancel.model_data", 0),
    CANCEL_BUTTON_NAME("confirm.cancel.name", "&c&lCANCEL"),
    CANCEL_BUTTON_LORE("confirm.cancel.lore", Collections.singletonList("&7Click to cancel")),

    PROFILE_TITLE("profile.title", "&9&lAuction House &8> &bYour Profile"),
    PROFILE_YOUR_LISTINGS_ICON("profile.your-listings.icon", "EMERALD"),
    PROFILE_YOUR_LISTINGS_MODEL_DATA("profile.your-listings.model_data", 0),
    PROFILE_YOUR_LISTINGS_NAME("profile.your-listings.name", "&1Your listings"),
    PROFILE_YOUR_LISTINGS_LORE("profile.your-listings.lore", List.of(
            "&fClick to view & manage",
            "&f{0} active listings!"
    )),
    PROFILE_COLLECTION_BOX_ICON("profile.collection-box.icon", "CHEST_MINECART"),
    PROFILE_COLLECTION_BOX_MODEL_DATA("profile.collection-box.model_data", 0),
    PROFILE_COLLECTION_BOX_NAME("profile.collection-box.name", "&e{0} Collection Box"),
    PROFILE_COLLECTION_BOX_LORE("profile.collection-box.lore", List.of(
            "&fClick to view & claim",
            "&f{0} purchases!"
    )),
    PROFILE_EXPIRED_LISTINGS_ICON("profile.expired-items.icon", "ENDER_CHEST"),
    PROFILE_EXPIRED_LISTINGS_MODEL_DATA("profile.expired-items.model_data", 0),
    PROFILE_EXPIRED_LISTINGS_NAME("profile.expired-items.name", "&c{0} Expired Listings"),
    PROFILE_EXPIRED_LISTINGS_LORE("profile.expired-items.lore", List.of(
            "&fClick to view & claim",
            "&f{0} expired listings!"
    )),

    PROFILE_HISTORIC_ITEMS_ICON("profile.historic-items.icon", "WRITABLE_BOOK"),
    PROFILE_HISTORIC_ITEMS_MODEL_DATA("profile.historic-items.model_data", 0),
    PROFILE_HISTORIC_ITEMS_NAME("profile.historic-items.name", "&c{0} History"),
    PROFILE_HISTORIC_ITEMS_LORE("profile.historic-items.lore", List.of(
            "&fClick to view",
            "&f{0} history!"
    )),


    COLLECTION_BOX_TITLE("collection-box.title", "&9&lAuction House &8> &e{0} Collection Box"),
    COLLECTION_BOX_LORE("collection-box.collectable-lore", List.of(
            "&8&n---------------------------",
            "&fAdded: &e{0} &fago",
            "&r ",
            "&eClick To Claim!",
            "&8&n---------------------------"
    )),

    EXPIRED_LISTINGS_TITLE("expired-listings.title", "&9&lAuction House &8> &c{0} Expired Listings"),
    EXPIRED_LISTINGS_LORE("expired-listings.collectable-lore", List.of(
            "&8&n---------------------------",
            "&fAdded: &e{0} &fago",
            "&r ",
            "&eClick To Re-Claim!",
            "&8&n---------------------------"
    )),

    HISTORY_SEARCH_MODEL_DATA("historic-items.search.model_data", 0),
    HISTORY_SEARCH_PLACEHOLDER("historic-items.search.placeholder", "Ex: 21/04/2024 22:26"),
    HISTORY_SEARCH_NAME("historic-items.search.name", "&eSearch Date"),
    HISTORY_SEARCH_LORE("historic-items.search.lore", Collections.singletonList("&fClick to search for a logs date & time!")),

    ACTIVE_LISTINGS_TITLE("active-listings.title", "&9&lAuction House &8> &1{0} Listings"),
    ACTIVE_LISTINGS_LORE("active-listings.title", List.of(
            "&8&n---------------------------",
            "&fCategory: &e{0}",
            "&r ",
            "&fPrice: &6${1}",
            "&r ",
            "&fExpires In: &e{2}",
            "&r ",
            "&eClick To Cancel This Listing!",
            "&8&n---------------------------"
    )),

    // To Keep
    NO_ITEM_FOUND_ICON("no-items-found.icon", "BARRIER"),
    NO_ITEM_FOUND_MODEL_DATA("no-items-found.model_data", 0),
    NO_ITEM_FOUND_NAME("no-items-found.name", "&c&lNo items found!"),
    NO_ITEM_FOUND_LORE("no-items-found.lore", Collections.emptyList()),

    BACK_BUTTON_ICON("back.icon", "FEATHER"),
    BACK_BUTTON_MODEL_DATA("back.model_data", 0),
    BACK_BUTTON_NAME("back.name", "&cGo Back"),
    BACK_BUTTON_LORE("back.lore", Collections.singletonList("&7Click to go back")),

    PREVIOUS_BUTTON_ICON("previous_page.icon", "ARROW"),
    PREVIOUS_BUTTON_MODEL_DATA("previous_page.model_data", 0),
    PREVIOUS_BUTTON_NAME("previous_page.name", "&c&lPrevious Page"),
    PREVIOUS_BUTTON_LORE("previous_page.lore", Collections.singletonList("&7Click to go to the previous page")),

    NEXT_BUTTON_ICON("next_page.icon", "ARROW"),
    NEXT_BUTTON_MODEL_DATA("next_page.model_data", 0),
    NEXT_BUTTON_NAME("next_page.name", "&a&lNext Page"),
    NEXT_BUTTON_LORE("next_page.lore", Collections.singletonList("&7Click to go to the next page")),

    SCROLL_NEXT_BUTTON_ICON("scroll_next.icon", "ARROW"),
    SCROLL_NEXT_BUTTON_MODEL_DATA("scroll_next.model_data", 0),
    SCROLL_NEXT_BUTTON_NAME("scroll_next.name", "&a&lScroll Categories Down"),
    SCROLL_NEXT_BUTTON_LORE("scroll_next.lore", Collections.singletonList("&7Click to move the categories down")),

    SCROLL_PREVIOUS_BUTTON_ICON("scroll_previous.icon", "ARROW"),
    SCROLL_PREVIOUS_BUTTON_MODEL_DATA("scroll_previous.model_data", 0),
    SCROLL_PREVIOUS_BUTTON_NAME("scroll_previous.name", "&a&lScroll Categories Up"),
    SCROLL_PREVIOUS_BUTTON_LORE("scroll_previous.lore", Collections.singletonList("&7Click to move the categories up")),
   
    CLOSE_BUTTON_ICON("close.icon", "BARRIER"),
    CLOSE_BUTTON_MODEL_DATA("close.model_data", 0),
    CLOSE_BUTTON_NAME("close.name", "&c&l✗ Close"),
    CLOSE_BUTTON_LORE("close.lore", Collections.singletonList("&7Click to close the menu")),
    
    BORDER_ICON("filler.icon", "BLACK_STAINED_GLASS_PANE"),
    BORDER_MODEL_DATA("filler.model-data", 0),
    BORDER_NAME("filler.name", "&r "),
    BORDER_LORE("filler.lore", Collections.singletonList("&8I <3 Fadah")),
    ;

    private final String path;
    private final Object defaultValue;

    public static void loadDefault() {
        BasicConfig configFile = Fadah.getINSTANCE().getMenusFile();

        for (Menus config : Menus.values()) {
            String path = config.path;
            String str = configFile.getString(path);
            if (str.equals(path)) {
                configFile.getConfiguration().set(path, config.defaultValue);
            }
        }

        configFile.save();
        configFile.load();
    }

    @Override
    public String toString() {
        String str = Fadah.getINSTANCE().getMenusFile().getString(path);
        if (str.equals(path)) {
            return defaultValue.toString();
        }
        return str;
    }

    public String toFormattedString() {
        String str = Fadah.getINSTANCE().getMenusFile().getString(path);
        if (str.equals(path)) {
            return StringUtils.colorize(defaultValue.toString());
        }
        return StringUtils.colorize(str);
    }

    public String toFormattedString(Object... replacements) {
        String str = Fadah.getINSTANCE().getMenusFile().getString(path);
        if (str.equals(path)) {
            return StringUtils.formatPlaceholders(StringUtils.colorize(defaultValue.toString()), replacements);
        }
        return StringUtils.colorize(StringUtils.formatPlaceholders(str, replacements));
    }

    public List<String> toLore() {
        List<String> str = Fadah.getINSTANCE().getMenusFile().getStringList(path);
        if (str.isEmpty() || str.get(0).equals(path)) {
            List<String> ret = new ArrayList<>();
            for (String line : (List<String>) defaultValue) ret.add(StringUtils.formatPlaceholders(line));
            return StringUtils.colorizeList(ret);
        }
        if (str.get(0).equals("null")) {
            return ImmutableList.of();
        }
        List<String> ret = new ArrayList<>();
        for (String line : str) ret.add(StringUtils.formatPlaceholders(line));
        return StringUtils.colorizeList(ret);
    }

    public List<String> toLore(Object... replacements) {
        List<String> str = Fadah.getINSTANCE().getMenusFile().getStringList(path);
        if (str.isEmpty() || str.get(0).equals(path)) {
            List<String> ret = new ArrayList<>();
            for (String line : (List<String>) defaultValue) ret.add(StringUtils.formatPlaceholders(line, replacements));
            return StringUtils.colorizeList(ret);
        }
        if (str.get(0).equals("null")) {
            return ImmutableList.of();
        }
        List<String> ret = new ArrayList<>();
        for (String line : str) {
            ret.add(StringUtils.formatPlaceholders(line, replacements));
        }
        return StringUtils.colorizeList(ret);
    }

    public int toInteger() {
        return Integer.parseInt(toString());
    }

    public Material toMaterial() {
        Material material;
        try {
            material = Material.valueOf(toString().toUpperCase());
        } catch (EnumConstantNotPresentException | IllegalArgumentException e) {
            material = Material.APPLE;
            Fadah.getConsole().severe("-----------------------------");
            Fadah.getConsole().severe("Config Incorrect!");
            Fadah.getConsole().severe("Material: " + toFormattedString());
            Fadah.getConsole().severe("Does Not Exist!");
            Fadah.getConsole().severe("Defaulting to APPLE");
            Fadah.getConsole().severe("-----------------------------");
        }
        return material;
    }
}

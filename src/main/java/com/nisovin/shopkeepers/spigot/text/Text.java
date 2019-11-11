package com.nisovin.shopkeepers.spigot.text;

import java.util.Arrays;

import com.nisovin.shopkeepers.util.Validate;

public class Text {

	private final String text; // not null, can be empty
	private String translationKey = null; // can be null
	private Object[] translationArgs = null;
	/**
	 * When shift-clicked by the player, this text gets inserted into his chat input.
	 * <p>
	 * Unlike {@link ClickEvent.Action#SUGGEST_COMMAND} this does not replace the already existing chat input.
	 */
	private String insertion = null; // can be null
	private HoverEvent hoverEvent = null; // can be null
	private ClickEvent clickEvent = null; // can be null

	public Text(String text) {
		Validate.notNull(text, "Text is null!");
		this.text = text;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @return the translationKey, can be <code>null</code>
	 */
	public String getTranslationKey() {
		return translationKey;
	}

	/**
	 * @param translationKey
	 *            the translationKey to set
	 * @return this
	 */
	public Text translationKey(String translationKey) {
		this.translationKey = translationKey;
		return this;
	}

	/**
	 * @return the translationArgs, can be <code>null</code>
	 */
	public Object[] getTranslationArgs() {
		return translationArgs;
	}

	/**
	 * @param translationArgs
	 *            the translationArgs to set
	 * @return this
	 */
	public Text translationArgs(Object... translationArgs) {
		this.translationArgs = translationArgs;
		return this;
	}

	/**
	 * Shortcut for setting the translation key and translation arguments.
	 * 
	 * @param translationKey
	 *            the translation key
	 * @param translationArgs
	 *            the translation arguments
	 * @return this
	 */
	public Text translationKey(String translationKey, Object... translationArgs) {
		this.translationKey(translationKey);
		this.translationArgs(translationArgs);
		return this;
	}

	/**
	 * @return the insertion, can be <code>null</code>
	 */
	public String getInsertion() {
		return insertion;
	}

	/**
	 * @param insertion
	 *            the insertion to set
	 * @return this
	 */
	public Text insertion(String insertion) {
		this.insertion = insertion;
		return this;
	}

	/**
	 * @return the hoverEvent, can be <code>null</code>
	 */
	public HoverEvent getHoverEvent() {
		return hoverEvent;
	}

	/**
	 * @param hoverEvent
	 *            the hoverEvent to set
	 * @return this
	 */
	public Text hoverEvent(HoverEvent hoverEvent) {
		this.hoverEvent = hoverEvent;
		return this;
	}

	/**
	 * Shortcut for adding a hover event.
	 * 
	 * @param hoverEventAction
	 *            the hover event action
	 * @param hoverEventValue
	 *            the hover event value
	 * @return this
	 */
	public Text hoverEvent(HoverEvent.Action hoverEventAction, String hoverEventValue) {
		return this.hoverEvent(new HoverEvent(hoverEventAction, hoverEventValue));
	}

	/**
	 * Shortcut for add a simple text hover event.
	 * 
	 * @param hoverText
	 *            the hover text
	 * @return this
	 */
	public Text hoverEvent(String hoverText) {
		return this.hoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, hoverText));
	}

	/**
	 * @return the clickEvent, can be <code>null</code>
	 */
	public ClickEvent getClickEvent() {
		return clickEvent;
	}

	/**
	 * @param clickEvent
	 *            the clickEvent to set
	 * @return this
	 */
	public Text clickEvent(ClickEvent clickEvent) {
		this.clickEvent = clickEvent;
		return this;
	}

	/**
	 * Shortcut for adding a click event.
	 * 
	 * @param clickEventAction
	 *            the click event action
	 * @param clickEventValue
	 *            the click event value
	 * @return this
	 */
	public Text clickEvent(ClickEvent.Action clickEventAction, String clickEventValue) {
		return this.clickEvent(new ClickEvent(clickEventAction, clickEventValue));
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Text [text=");
		builder.append(text);
		builder.append(", translationKey=");
		builder.append(translationKey);
		builder.append(", translationArgs=");
		builder.append(Arrays.toString(translationArgs));
		builder.append(", insertion=");
		builder.append(insertion);
		builder.append(", hoverEvent=");
		builder.append(hoverEvent);
		builder.append(", clickEvent=");
		builder.append(clickEvent);
		builder.append("]");
		return builder.toString();
	}
}

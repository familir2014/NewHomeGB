@Data сочетает в себе аннотации:

@ToString
@EqualsAndHashCode
@Getter on all fields
@Setter on all non-final fields
@RequiredArgsConstructor Стоит помнить, что если entity будет использоваться в коллекция, то Equals/Hashcode будет сгенерирован фреймворком
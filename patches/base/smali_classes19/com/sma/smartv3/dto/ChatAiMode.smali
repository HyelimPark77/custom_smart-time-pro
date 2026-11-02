.class public final enum Lcom/sma/smartv3/dto/ChatAiMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/dto/ChatAiMode$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/dto/ChatAiMode;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChatAiMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatAiMode.kt\ncom/sma/smartv3/dto/ChatAiMode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1208#2,2:24\n1236#2,4:26\n*S KotlinDebug\n*F\n+ 1 ChatAiMode.kt\ncom/sma/smartv3/dto/ChatAiMode\n*L\n13#1:24,2\n13#1:26,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nChatAiMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatAiMode.kt\ncom/sma/smartv3/dto/ChatAiMode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1208#2,2:24\n1236#2,4:26\n*S KotlinDebug\n*F\n+ 1 ChatAiMode.kt\ncom/sma/smartv3/dto/ChatAiMode\n*L\n13#1:24,2\n13#1:26,4\n*E\n"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/dto/ChatAiMode;

.field public static final enum BAI_DU:Lcom/sma/smartv3/dto/ChatAiMode;

.field public static final Companion:Lcom/sma/smartv3/dto/ChatAiMode$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final enum DEEP_SEEK:Lcom/sma/smartv3/dto/ChatAiMode;

.field public static final enum OPEN_AI:Lcom/sma/smartv3/dto/ChatAiMode;

.field public static final enum QIAN_WEN:Lcom/sma/smartv3/dto/ChatAiMode;

.field public static final enum SPARK_CHAIN:Lcom/sma/smartv3/dto/ChatAiMode;

.field private static final flagToEnumMap$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/sma/smartv3/dto/ChatAiMode;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private final modelFlag:I

.field private final modelName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/dto/ChatAiMode;
    .locals 5

    sget-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->BAI_DU:Lcom/sma/smartv3/dto/ChatAiMode;

    sget-object v1, Lcom/sma/smartv3/dto/ChatAiMode;->SPARK_CHAIN:Lcom/sma/smartv3/dto/ChatAiMode;

    sget-object v2, Lcom/sma/smartv3/dto/ChatAiMode;->OPEN_AI:Lcom/sma/smartv3/dto/ChatAiMode;

    sget-object v3, Lcom/sma/smartv3/dto/ChatAiMode;->DEEP_SEEK:Lcom/sma/smartv3/dto/ChatAiMode;

    sget-object v4, Lcom/sma/smartv3/dto/ChatAiMode;->QIAN_WEN:Lcom/sma/smartv3/dto/ChatAiMode;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/sma/smartv3/dto/ChatAiMode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/sma/smartv3/dto/ChatAiMode;

    const-string v1, "BAI_DU"

    const/4 v2, 0x0

    const-string v3, "baiduAIService"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/sma/smartv3/dto/ChatAiMode;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->BAI_DU:Lcom/sma/smartv3/dto/ChatAiMode;

    new-instance v0, Lcom/sma/smartv3/dto/ChatAiMode;

    const-string v1, "SPARK_CHAIN"

    const-string v2, "sparkAIService"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/sma/smartv3/dto/ChatAiMode;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->SPARK_CHAIN:Lcom/sma/smartv3/dto/ChatAiMode;

    new-instance v0, Lcom/sma/smartv3/dto/ChatAiMode;

    const-string v1, "OPEN_AI"

    const-string v2, "openAIService"

    const/4 v4, 0x3

    invoke-direct {v0, v1, v3, v2, v4}, Lcom/sma/smartv3/dto/ChatAiMode;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->OPEN_AI:Lcom/sma/smartv3/dto/ChatAiMode;

    new-instance v0, Lcom/sma/smartv3/dto/ChatAiMode;

    const-string v1, "DEEP_SEEK"

    const-string v2, "deepseekAIService"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/sma/smartv3/dto/ChatAiMode;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->DEEP_SEEK:Lcom/sma/smartv3/dto/ChatAiMode;

    new-instance v0, Lcom/sma/smartv3/dto/ChatAiMode;

    const-string v1, "qwenAIService"

    const/4 v2, 0x7

    const-string v4, "QIAN_WEN"

    invoke-direct {v0, v4, v3, v1, v2}, Lcom/sma/smartv3/dto/ChatAiMode;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->QIAN_WEN:Lcom/sma/smartv3/dto/ChatAiMode;

    invoke-static {}, Lcom/sma/smartv3/dto/ChatAiMode;->$values()[Lcom/sma/smartv3/dto/ChatAiMode;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->$VALUES:[Lcom/sma/smartv3/dto/ChatAiMode;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/sma/smartv3/dto/ChatAiMode$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/dto/ChatAiMode$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->Companion:Lcom/sma/smartv3/dto/ChatAiMode$OXO1;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiO0IOiOO;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/iiO0IOiOO;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->flagToEnumMap$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/sma/smartv3/dto/ChatAiMode;->modelName:Ljava/lang/String;

    iput p4, p0, Lcom/sma/smartv3/dto/ChatAiMode;->modelFlag:I

    return-void
.end method

.method public static synthetic OXO1()Ljava/util/Map;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/dto/ChatAiMode;->flagToEnumMap_delegate$lambda$0()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getFlagToEnumMap$delegate$cp()Lkotlin/Lazy;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->flagToEnumMap$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method private static final flagToEnumMap_delegate$lambda$0()Ljava/util/Map;
    .locals 4

    invoke-static {}, Lcom/sma/smartv3/dto/ChatAiMode;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/q40;->IO(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lkotlin/ranges/iO;->XX0(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/sma/smartv3/dto/ChatAiMode;

    iget v3, v3, Lcom/sma/smartv3/dto/ChatAiMode;->modelFlag:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/sma/smartv3/dto/ChatAiMode;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/dto/ChatAiMode;
    .locals 1

    const-class v0, Lcom/sma/smartv3/dto/ChatAiMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/dto/ChatAiMode;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/dto/ChatAiMode;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/dto/ChatAiMode;->$VALUES:[Lcom/sma/smartv3/dto/ChatAiMode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/dto/ChatAiMode;

    return-object v0
.end method


# virtual methods
.method public final getModelFlag()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/dto/ChatAiMode;->modelFlag:I

    return v0
.end method

.method public final getModelName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/dto/ChatAiMode;->modelName:Ljava/lang/String;

    return-object v0
.end method

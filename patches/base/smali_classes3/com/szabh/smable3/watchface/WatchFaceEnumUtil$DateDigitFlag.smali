.class public final enum Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/watchface/WatchFaceEnumUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "DateDigitFlag"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

.field public static final enum DATE_DIGIT_FLAG_DAY:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

.field public static final enum DATE_DIGIT_FLAG_MONTH:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

.field public static final enum DATE_DIGIT_FLAG_YEAR:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;


# instance fields
.field private final value:B


# direct methods
.method private static final synthetic $values()[Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;
    .locals 3

    sget-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;->DATE_DIGIT_FLAG_YEAR:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

    sget-object v1, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;->DATE_DIGIT_FLAG_MONTH:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

    sget-object v2, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;->DATE_DIGIT_FLAG_DAY:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

    filled-new-array {v0, v1, v2}, [Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

    const-string v1, "DATE_DIGIT_FLAG_YEAR"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;->DATE_DIGIT_FLAG_YEAR:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

    new-instance v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

    const-string v1, "DATE_DIGIT_FLAG_MONTH"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;->DATE_DIGIT_FLAG_MONTH:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

    new-instance v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

    const-string v1, "DATE_DIGIT_FLAG_DAY"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;->DATE_DIGIT_FLAG_DAY:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

    invoke-static {}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;->$values()[Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;->$VALUES:[Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;->value:B

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;
    .locals 1

    const-class v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

    return-object p0
.end method

.method public static values()[Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;->$VALUES:[Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;

    return-object v0
.end method


# virtual methods
.method public final getValue()B
    .locals 1

    iget-byte v0, p0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$DateDigitFlag;->value:B

    return v0
.end method

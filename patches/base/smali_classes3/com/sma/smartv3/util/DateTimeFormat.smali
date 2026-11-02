.class public final enum Lcom/sma/smartv3/util/DateTimeFormat;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/util/DateTimeFormat$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/util/DateTimeFormat;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/util/DateTimeFormat;

.field public static final Companion:Lcom/sma/smartv3/util/DateTimeFormat$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final enum MMddyyyy:Lcom/sma/smartv3/util/DateTimeFormat;

.field public static final enum ddMMyyyy:Lcom/sma/smartv3/util/DateTimeFormat;

.field public static final enum yyyyMMdd:Lcom/sma/smartv3/util/DateTimeFormat;


# instance fields
.field private final type:I


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/util/DateTimeFormat;
    .locals 3

    sget-object v0, Lcom/sma/smartv3/util/DateTimeFormat;->yyyyMMdd:Lcom/sma/smartv3/util/DateTimeFormat;

    sget-object v1, Lcom/sma/smartv3/util/DateTimeFormat;->ddMMyyyy:Lcom/sma/smartv3/util/DateTimeFormat;

    sget-object v2, Lcom/sma/smartv3/util/DateTimeFormat;->MMddyyyy:Lcom/sma/smartv3/util/DateTimeFormat;

    filled-new-array {v0, v1, v2}, [Lcom/sma/smartv3/util/DateTimeFormat;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/util/DateTimeFormat;

    const-string v1, "yyyyMMdd"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/util/DateTimeFormat;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/util/DateTimeFormat;->yyyyMMdd:Lcom/sma/smartv3/util/DateTimeFormat;

    new-instance v0, Lcom/sma/smartv3/util/DateTimeFormat;

    const-string v1, "ddMMyyyy"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/util/DateTimeFormat;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/util/DateTimeFormat;->ddMMyyyy:Lcom/sma/smartv3/util/DateTimeFormat;

    new-instance v0, Lcom/sma/smartv3/util/DateTimeFormat;

    const-string v1, "MMddyyyy"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/sma/smartv3/util/DateTimeFormat;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/util/DateTimeFormat;->MMddyyyy:Lcom/sma/smartv3/util/DateTimeFormat;

    invoke-static {}, Lcom/sma/smartv3/util/DateTimeFormat;->$values()[Lcom/sma/smartv3/util/DateTimeFormat;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/util/DateTimeFormat;->$VALUES:[Lcom/sma/smartv3/util/DateTimeFormat;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/util/DateTimeFormat;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/sma/smartv3/util/DateTimeFormat$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/util/DateTimeFormat$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/util/DateTimeFormat;->Companion:Lcom/sma/smartv3/util/DateTimeFormat$OXO1;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/sma/smartv3/util/DateTimeFormat;->type:I

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
            "Lcom/sma/smartv3/util/DateTimeFormat;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/util/DateTimeFormat;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/util/DateTimeFormat;
    .locals 1

    const-class v0, Lcom/sma/smartv3/util/DateTimeFormat;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/util/DateTimeFormat;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/util/DateTimeFormat;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/util/DateTimeFormat;->$VALUES:[Lcom/sma/smartv3/util/DateTimeFormat;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/util/DateTimeFormat;

    return-object v0
.end method


# virtual methods
.method public final getType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/util/DateTimeFormat;->type:I

    return v0
.end method

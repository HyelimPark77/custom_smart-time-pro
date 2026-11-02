.class public final enum Lcom/sma/smartv3/view/text/MyTypeface;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/view/text/MyTypeface;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/view/text/MyTypeface;

.field public static final enum DIN_COND_BOLD:Lcom/sma/smartv3/view/text/MyTypeface;
    .annotation runtime Lkotlin/Deprecated;
        message = "\u5b57\u4f53\u5e93\u5df2\u5220\u9664"
    .end annotation
.end field

.field public static final enum PF_BOLD:Lcom/sma/smartv3/view/text/MyTypeface;
    .annotation runtime Lkotlin/Deprecated;
        message = "\u5b57\u4f53\u5e93\u5df2\u5220\u9664"
    .end annotation
.end field

.field public static final enum PF_EXTRA_LIGHT:Lcom/sma/smartv3/view/text/MyTypeface;
    .annotation runtime Lkotlin/Deprecated;
        message = "\u5b57\u4f53\u5e93\u5df2\u5220\u9664"
    .end annotation
.end field

.field public static final enum PF_MEDIUM:Lcom/sma/smartv3/view/text/MyTypeface;
    .annotation runtime Lkotlin/Deprecated;
        message = "\u5b57\u4f53\u5e93\u5df2\u5220\u9664"
    .end annotation
.end field

.field public static final enum PF_REGULAR:Lcom/sma/smartv3/view/text/MyTypeface;
    .annotation runtime Lkotlin/Deprecated;
        message = "\u5b57\u4f53\u5e93\u5df2\u5220\u9664"
    .end annotation
.end field


# instance fields
.field private final fontName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/view/text/MyTypeface;
    .locals 5

    sget-object v0, Lcom/sma/smartv3/view/text/MyTypeface;->DIN_COND_BOLD:Lcom/sma/smartv3/view/text/MyTypeface;

    sget-object v1, Lcom/sma/smartv3/view/text/MyTypeface;->PF_MEDIUM:Lcom/sma/smartv3/view/text/MyTypeface;

    sget-object v2, Lcom/sma/smartv3/view/text/MyTypeface;->PF_BOLD:Lcom/sma/smartv3/view/text/MyTypeface;

    sget-object v3, Lcom/sma/smartv3/view/text/MyTypeface;->PF_EXTRA_LIGHT:Lcom/sma/smartv3/view/text/MyTypeface;

    sget-object v4, Lcom/sma/smartv3/view/text/MyTypeface;->PF_REGULAR:Lcom/sma/smartv3/view/text/MyTypeface;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/sma/smartv3/view/text/MyTypeface;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/sma/smartv3/view/text/MyTypeface;

    const/4 v1, 0x0

    const-string v2, "DINCond-Bold.otf"

    const-string v3, "DIN_COND_BOLD"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/view/text/MyTypeface;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/view/text/MyTypeface;->DIN_COND_BOLD:Lcom/sma/smartv3/view/text/MyTypeface;

    new-instance v0, Lcom/sma/smartv3/view/text/MyTypeface;

    const/4 v1, 0x1

    const-string v2, "PingFang Medium_0.ttf"

    const-string v3, "PF_MEDIUM"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/view/text/MyTypeface;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/view/text/MyTypeface;->PF_MEDIUM:Lcom/sma/smartv3/view/text/MyTypeface;

    new-instance v0, Lcom/sma/smartv3/view/text/MyTypeface;

    const/4 v1, 0x2

    const-string v2, "PingFang Bold.ttf"

    const-string v3, "PF_BOLD"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/view/text/MyTypeface;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/view/text/MyTypeface;->PF_BOLD:Lcom/sma/smartv3/view/text/MyTypeface;

    new-instance v0, Lcom/sma/smartv3/view/text/MyTypeface;

    const/4 v1, 0x3

    const-string v2, "PingFang ExtraLight.ttf"

    const-string v3, "PF_EXTRA_LIGHT"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/view/text/MyTypeface;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/view/text/MyTypeface;->PF_EXTRA_LIGHT:Lcom/sma/smartv3/view/text/MyTypeface;

    new-instance v0, Lcom/sma/smartv3/view/text/MyTypeface;

    const/4 v1, 0x4

    const-string v2, "PingFang Regular_0.ttf"

    const-string v3, "PF_REGULAR"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/view/text/MyTypeface;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/view/text/MyTypeface;->PF_REGULAR:Lcom/sma/smartv3/view/text/MyTypeface;

    invoke-static {}, Lcom/sma/smartv3/view/text/MyTypeface;->$values()[Lcom/sma/smartv3/view/text/MyTypeface;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/view/text/MyTypeface;->$VALUES:[Lcom/sma/smartv3/view/text/MyTypeface;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/view/text/MyTypeface;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/sma/smartv3/view/text/MyTypeface;->fontName:Ljava/lang/String;

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
            "Lcom/sma/smartv3/view/text/MyTypeface;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/view/text/MyTypeface;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/view/text/MyTypeface;
    .locals 1

    const-class v0, Lcom/sma/smartv3/view/text/MyTypeface;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/MyTypeface;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/view/text/MyTypeface;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/view/text/MyTypeface;->$VALUES:[Lcom/sma/smartv3/view/text/MyTypeface;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/view/text/MyTypeface;

    return-object v0
.end method


# virtual methods
.method public final getFontName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/text/MyTypeface;->fontName:Ljava/lang/String;

    return-object v0
.end method

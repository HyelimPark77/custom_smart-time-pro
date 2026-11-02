.class public final enum Lcom/szabh/smable3/entity/Stage;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/szabh/smable3/entity/Stage;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/szabh/smable3/entity/Stage;

.field public static final enum COOL_DOWN:Lcom/szabh/smable3/entity/Stage;

.field public static final enum GO_FOR:Lcom/szabh/smable3/entity/Stage;

.field public static final enum OTHER:Lcom/szabh/smable3/entity/Stage;

.field public static final enum RECOVERY:Lcom/szabh/smable3/entity/Stage;

.field public static final enum REST_FOR:Lcom/szabh/smable3/entity/Stage;

.field public static final enum WARM_UP:Lcom/szabh/smable3/entity/Stage;


# instance fields
.field private final stage:I


# direct methods
.method private static final synthetic $values()[Lcom/szabh/smable3/entity/Stage;
    .locals 6

    sget-object v0, Lcom/szabh/smable3/entity/Stage;->WARM_UP:Lcom/szabh/smable3/entity/Stage;

    sget-object v1, Lcom/szabh/smable3/entity/Stage;->GO_FOR:Lcom/szabh/smable3/entity/Stage;

    sget-object v2, Lcom/szabh/smable3/entity/Stage;->RECOVERY:Lcom/szabh/smable3/entity/Stage;

    sget-object v3, Lcom/szabh/smable3/entity/Stage;->REST_FOR:Lcom/szabh/smable3/entity/Stage;

    sget-object v4, Lcom/szabh/smable3/entity/Stage;->COOL_DOWN:Lcom/szabh/smable3/entity/Stage;

    sget-object v5, Lcom/szabh/smable3/entity/Stage;->OTHER:Lcom/szabh/smable3/entity/Stage;

    filled-new-array/range {v0 .. v5}, [Lcom/szabh/smable3/entity/Stage;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/szabh/smable3/entity/Stage;

    const-string v1, "WARM_UP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/Stage;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/Stage;->WARM_UP:Lcom/szabh/smable3/entity/Stage;

    new-instance v0, Lcom/szabh/smable3/entity/Stage;

    const-string v1, "GO_FOR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/Stage;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/Stage;->GO_FOR:Lcom/szabh/smable3/entity/Stage;

    new-instance v0, Lcom/szabh/smable3/entity/Stage;

    const-string v1, "RECOVERY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/Stage;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/Stage;->RECOVERY:Lcom/szabh/smable3/entity/Stage;

    new-instance v0, Lcom/szabh/smable3/entity/Stage;

    const-string v1, "REST_FOR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/Stage;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/Stage;->REST_FOR:Lcom/szabh/smable3/entity/Stage;

    new-instance v0, Lcom/szabh/smable3/entity/Stage;

    const-string v1, "COOL_DOWN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/Stage;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/Stage;->COOL_DOWN:Lcom/szabh/smable3/entity/Stage;

    new-instance v0, Lcom/szabh/smable3/entity/Stage;

    const/4 v1, 0x5

    const/16 v2, 0xff

    const-string v3, "OTHER"

    invoke-direct {v0, v3, v1, v2}, Lcom/szabh/smable3/entity/Stage;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/Stage;->OTHER:Lcom/szabh/smable3/entity/Stage;

    invoke-static {}, Lcom/szabh/smable3/entity/Stage;->$values()[Lcom/szabh/smable3/entity/Stage;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/Stage;->$VALUES:[Lcom/szabh/smable3/entity/Stage;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/Stage;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    iput p3, p0, Lcom/szabh/smable3/entity/Stage;->stage:I

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
            "Lcom/szabh/smable3/entity/Stage;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/entity/Stage;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/szabh/smable3/entity/Stage;
    .locals 1

    const-class v0, Lcom/szabh/smable3/entity/Stage;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/entity/Stage;

    return-object p0
.end method

.method public static values()[Lcom/szabh/smable3/entity/Stage;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/entity/Stage;->$VALUES:[Lcom/szabh/smable3/entity/Stage;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/szabh/smable3/entity/Stage;

    return-object v0
.end method


# virtual methods
.method public final getStage()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/Stage;->stage:I

    return v0
.end method

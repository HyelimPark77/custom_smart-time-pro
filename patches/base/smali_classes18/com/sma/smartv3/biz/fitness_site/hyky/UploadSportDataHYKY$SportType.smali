.class public final enum Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SportType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

.field public static final enum CYCLING:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

.field public static final enum MOUNTAINEERING:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

.field public static final enum OTHER:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

.field public static final enum RUNNING:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

.field public static final enum SKIPPING_ROPE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

.field public static final enum SWIM:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

.field public static final enum WALK:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;
    .locals 7

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->SKIPPING_ROPE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    sget-object v1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->RUNNING:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    sget-object v2, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->CYCLING:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    sget-object v3, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->MOUNTAINEERING:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    sget-object v4, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->SWIM:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    sget-object v5, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->WALK:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    sget-object v6, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->OTHER:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    filled-new-array/range {v0 .. v6}, [Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    const-string v1, "SKIPPING_ROPE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->SKIPPING_ROPE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    const-string v1, "RUNNING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->RUNNING:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    const-string v1, "CYCLING"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->CYCLING:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    const-string v1, "MOUNTAINEERING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v3, v2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->MOUNTAINEERING:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    const-string v1, "SWIM"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->SWIM:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    const-string v1, "WALK"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v3, v2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->WALK:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    const-string v1, "OTHER"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->OTHER:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    invoke-static {}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->$values()[Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->$VALUES:[Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    iput p3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->value:I

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
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;
    .locals 1

    const-class v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->$VALUES:[Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->value:I

    return v0
.end method

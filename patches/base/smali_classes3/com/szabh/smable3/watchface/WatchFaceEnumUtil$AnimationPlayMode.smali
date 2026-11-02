.class public final enum Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/watchface/WatchFaceEnumUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AnimationPlayMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

.field public static final enum FRAME_DATA_MODE_LOOP:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

.field public static final enum FRAME_DATA_MODE_MANUAL_CLICK_LOOP:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

.field public static final enum FRAME_DATA_MODE_SINGLE:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

.field public static final enum FRAME_DATA_MODE_SINGLE_LOOP:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;
    .locals 4

    sget-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;->FRAME_DATA_MODE_SINGLE_LOOP:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    sget-object v1, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;->FRAME_DATA_MODE_LOOP:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    sget-object v2, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;->FRAME_DATA_MODE_MANUAL_CLICK_LOOP:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    sget-object v3, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;->FRAME_DATA_MODE_SINGLE:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    filled-new-array {v0, v1, v2, v3}, [Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    const-string v1, "FRAME_DATA_MODE_SINGLE_LOOP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;->FRAME_DATA_MODE_SINGLE_LOOP:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    new-instance v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    const-string v1, "FRAME_DATA_MODE_LOOP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;->FRAME_DATA_MODE_LOOP:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    new-instance v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    const-string v1, "FRAME_DATA_MODE_MANUAL_CLICK_LOOP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;->FRAME_DATA_MODE_MANUAL_CLICK_LOOP:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    new-instance v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    const-string v1, "FRAME_DATA_MODE_SINGLE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;->FRAME_DATA_MODE_SINGLE:Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    invoke-static {}, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;->$values()[Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;->$VALUES:[Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    iput p3, p0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;->value:I

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
            "Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;
    .locals 1

    const-class v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    return-object p0
.end method

.method public static values()[Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;->$VALUES:[Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/watchface/WatchFaceEnumUtil$AnimationPlayMode;->value:I

    return v0
.end method

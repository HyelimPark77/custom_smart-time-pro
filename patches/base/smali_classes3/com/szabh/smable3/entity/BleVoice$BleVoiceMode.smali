.class public final enum Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/entity/BleVoice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "BleVoiceMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

.field public static final enum AI_TRANSLATE:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

.field public static final enum AI_VOICE_ASSISTANT:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

.field public static final enum AI_WATCH_DIAL:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

.field public static final enum EAR_TRANSFER:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

.field public static final enum EAR_TRANSFER_TRANSLATE:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

.field public static final enum ONLY_RECOGNIZE:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

.field public static final enum SIMULTANEOUS:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

.field public static final enum TEST_MODE:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;


# instance fields
.field private final flag:I


# direct methods
.method private static final synthetic $values()[Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;
    .locals 8

    sget-object v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->AI_VOICE_ASSISTANT:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    sget-object v1, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->AI_WATCH_DIAL:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    sget-object v2, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->AI_TRANSLATE:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    sget-object v3, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->EAR_TRANSFER:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    sget-object v4, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->EAR_TRANSFER_TRANSLATE:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    sget-object v5, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->ONLY_RECOGNIZE:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    sget-object v6, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->SIMULTANEOUS:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    sget-object v7, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->TEST_MODE:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    filled-new-array/range {v0 .. v7}, [Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    const-string v1, "AI_VOICE_ASSISTANT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->AI_VOICE_ASSISTANT:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    new-instance v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    const-string v1, "AI_WATCH_DIAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->AI_WATCH_DIAL:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    new-instance v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    const-string v1, "AI_TRANSLATE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->AI_TRANSLATE:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    new-instance v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    const-string v1, "EAR_TRANSFER"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->EAR_TRANSFER:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    new-instance v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    const-string v1, "EAR_TRANSFER_TRANSLATE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->EAR_TRANSFER_TRANSLATE:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    new-instance v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    const-string v1, "ONLY_RECOGNIZE"

    const/4 v2, 0x5

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->ONLY_RECOGNIZE:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    new-instance v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    const-string v1, "SIMULTANEOUS"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v3, v2}, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->SIMULTANEOUS:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    new-instance v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    const-string v1, "TEST_MODE"

    const/16 v3, 0x8

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->TEST_MODE:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    invoke-static {}, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->$values()[Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->$VALUES:[Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    iput p3, p0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->flag:I

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
            "Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;
    .locals 1

    const-class v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    return-object p0
.end method

.method public static values()[Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->$VALUES:[Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    return-object v0
.end method


# virtual methods
.method public final getFlag()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->flag:I

    return v0
.end method

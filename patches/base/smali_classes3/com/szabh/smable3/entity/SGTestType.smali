.class public final enum Lcom/szabh/smable3/entity/SGTestType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/SGTestType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/szabh/smable3/entity/SGTestType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/szabh/smable3/entity/SGTestType;

.field public static final enum ADJUST_VOLUME:Lcom/szabh/smable3/entity/SGTestType;

.field public static final enum AI_VOICE_ASSISTANT:Lcom/szabh/smable3/entity/SGTestType;

.field public static final Companion:Lcom/szabh/smable3/entity/SGTestType$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final enum ENTER:Lcom/szabh/smable3/entity/SGTestType;

.field public static final enum MUCIC_NEXT:Lcom/szabh/smable3/entity/SGTestType;

.field public static final enum MUISC_PLAY_PAUSE:Lcom/szabh/smable3/entity/SGTestType;

.field public static final enum NONE:Lcom/szabh/smable3/entity/SGTestType;

.field public static final enum QUIT:Lcom/szabh/smable3/entity/SGTestType;

.field public static final enum RECORD_AUDIO_START:Lcom/szabh/smable3/entity/SGTestType;

.field public static final enum RECORD_AUDIO_STOP:Lcom/szabh/smable3/entity/SGTestType;

.field public static final enum RECORD_START:Lcom/szabh/smable3/entity/SGTestType;

.field public static final enum RECORD_STOP:Lcom/szabh/smable3/entity/SGTestType;

.field public static final enum TAKE_PHOTO:Lcom/szabh/smable3/entity/SGTestType;


# instance fields
.field private final type:I


# direct methods
.method private static final synthetic $values()[Lcom/szabh/smable3/entity/SGTestType;
    .locals 12

    sget-object v0, Lcom/szabh/smable3/entity/SGTestType;->MUISC_PLAY_PAUSE:Lcom/szabh/smable3/entity/SGTestType;

    sget-object v1, Lcom/szabh/smable3/entity/SGTestType;->ADJUST_VOLUME:Lcom/szabh/smable3/entity/SGTestType;

    sget-object v2, Lcom/szabh/smable3/entity/SGTestType;->MUCIC_NEXT:Lcom/szabh/smable3/entity/SGTestType;

    sget-object v3, Lcom/szabh/smable3/entity/SGTestType;->TAKE_PHOTO:Lcom/szabh/smable3/entity/SGTestType;

    sget-object v4, Lcom/szabh/smable3/entity/SGTestType;->RECORD_START:Lcom/szabh/smable3/entity/SGTestType;

    sget-object v5, Lcom/szabh/smable3/entity/SGTestType;->RECORD_STOP:Lcom/szabh/smable3/entity/SGTestType;

    sget-object v6, Lcom/szabh/smable3/entity/SGTestType;->AI_VOICE_ASSISTANT:Lcom/szabh/smable3/entity/SGTestType;

    sget-object v7, Lcom/szabh/smable3/entity/SGTestType;->RECORD_AUDIO_START:Lcom/szabh/smable3/entity/SGTestType;

    sget-object v8, Lcom/szabh/smable3/entity/SGTestType;->RECORD_AUDIO_STOP:Lcom/szabh/smable3/entity/SGTestType;

    sget-object v9, Lcom/szabh/smable3/entity/SGTestType;->ENTER:Lcom/szabh/smable3/entity/SGTestType;

    sget-object v10, Lcom/szabh/smable3/entity/SGTestType;->QUIT:Lcom/szabh/smable3/entity/SGTestType;

    sget-object v11, Lcom/szabh/smable3/entity/SGTestType;->NONE:Lcom/szabh/smable3/entity/SGTestType;

    filled-new-array/range {v0 .. v11}, [Lcom/szabh/smable3/entity/SGTestType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/szabh/smable3/entity/SGTestType;

    const-string v1, "MUISC_PLAY_PAUSE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/entity/SGTestType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/SGTestType;->MUISC_PLAY_PAUSE:Lcom/szabh/smable3/entity/SGTestType;

    new-instance v0, Lcom/szabh/smable3/entity/SGTestType;

    const-string v1, "ADJUST_VOLUME"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/szabh/smable3/entity/SGTestType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/SGTestType;->ADJUST_VOLUME:Lcom/szabh/smable3/entity/SGTestType;

    new-instance v0, Lcom/szabh/smable3/entity/SGTestType;

    const-string v1, "MUCIC_NEXT"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/entity/SGTestType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/SGTestType;->MUCIC_NEXT:Lcom/szabh/smable3/entity/SGTestType;

    new-instance v0, Lcom/szabh/smable3/entity/SGTestType;

    const-string v1, "TAKE_PHOTO"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v3, v2}, Lcom/szabh/smable3/entity/SGTestType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/SGTestType;->TAKE_PHOTO:Lcom/szabh/smable3/entity/SGTestType;

    new-instance v0, Lcom/szabh/smable3/entity/SGTestType;

    const-string v1, "RECORD_START"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/entity/SGTestType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/SGTestType;->RECORD_START:Lcom/szabh/smable3/entity/SGTestType;

    new-instance v0, Lcom/szabh/smable3/entity/SGTestType;

    const-string v1, "RECORD_STOP"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v3, v2}, Lcom/szabh/smable3/entity/SGTestType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/SGTestType;->RECORD_STOP:Lcom/szabh/smable3/entity/SGTestType;

    new-instance v0, Lcom/szabh/smable3/entity/SGTestType;

    const-string v1, "AI_VOICE_ASSISTANT"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/entity/SGTestType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/SGTestType;->AI_VOICE_ASSISTANT:Lcom/szabh/smable3/entity/SGTestType;

    new-instance v0, Lcom/szabh/smable3/entity/SGTestType;

    const-string v1, "RECORD_AUDIO_START"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v3, v2}, Lcom/szabh/smable3/entity/SGTestType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/SGTestType;->RECORD_AUDIO_START:Lcom/szabh/smable3/entity/SGTestType;

    new-instance v0, Lcom/szabh/smable3/entity/SGTestType;

    const-string v1, "RECORD_AUDIO_STOP"

    const/16 v3, 0x9

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/entity/SGTestType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/SGTestType;->RECORD_AUDIO_STOP:Lcom/szabh/smable3/entity/SGTestType;

    new-instance v0, Lcom/szabh/smable3/entity/SGTestType;

    const-string v1, "ENTER"

    const/16 v2, 0x80

    invoke-direct {v0, v1, v3, v2}, Lcom/szabh/smable3/entity/SGTestType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/SGTestType;->ENTER:Lcom/szabh/smable3/entity/SGTestType;

    new-instance v0, Lcom/szabh/smable3/entity/SGTestType;

    const/16 v1, 0xa

    const/16 v2, 0x81

    const-string v3, "QUIT"

    invoke-direct {v0, v3, v1, v2}, Lcom/szabh/smable3/entity/SGTestType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/SGTestType;->QUIT:Lcom/szabh/smable3/entity/SGTestType;

    new-instance v0, Lcom/szabh/smable3/entity/SGTestType;

    const/16 v1, 0xb

    const v2, 0xffff

    const-string v3, "NONE"

    invoke-direct {v0, v3, v1, v2}, Lcom/szabh/smable3/entity/SGTestType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/SGTestType;->NONE:Lcom/szabh/smable3/entity/SGTestType;

    invoke-static {}, Lcom/szabh/smable3/entity/SGTestType;->$values()[Lcom/szabh/smable3/entity/SGTestType;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/SGTestType;->$VALUES:[Lcom/szabh/smable3/entity/SGTestType;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/SGTestType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/szabh/smable3/entity/SGTestType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/SGTestType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/SGTestType;->Companion:Lcom/szabh/smable3/entity/SGTestType$Companion;

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

    iput p3, p0, Lcom/szabh/smable3/entity/SGTestType;->type:I

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
            "Lcom/szabh/smable3/entity/SGTestType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/entity/SGTestType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/szabh/smable3/entity/SGTestType;
    .locals 1

    const-class v0, Lcom/szabh/smable3/entity/SGTestType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/entity/SGTestType;

    return-object p0
.end method

.method public static values()[Lcom/szabh/smable3/entity/SGTestType;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/entity/SGTestType;->$VALUES:[Lcom/szabh/smable3/entity/SGTestType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/szabh/smable3/entity/SGTestType;

    return-object v0
.end method


# virtual methods
.method public final getType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/SGTestType;->type:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    iget v1, p0, Lcom/szabh/smable3/entity/SGTestType;->type:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "0x%02X_"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "format(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final enum Lcom/szabh/smable3/entity/AIImageResolution;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/AIImageResolution$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/szabh/smable3/entity/AIImageResolution;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/szabh/smable3/entity/AIImageResolution;

.field public static final Companion:Lcom/szabh/smable3/entity/AIImageResolution$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final enum IR_180P:Lcom/szabh/smable3/entity/AIImageResolution;

.field public static final enum IR_360P:Lcom/szabh/smable3/entity/AIImageResolution;

.field public static final enum IR_480P:Lcom/szabh/smable3/entity/AIImageResolution;

.field public static final enum IR_600P:Lcom/szabh/smable3/entity/AIImageResolution;

.field public static final enum IR_720P:Lcom/szabh/smable3/entity/AIImageResolution;


# instance fields
.field private final label:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final value:I


# direct methods
.method private static final synthetic $values()[Lcom/szabh/smable3/entity/AIImageResolution;
    .locals 5

    sget-object v0, Lcom/szabh/smable3/entity/AIImageResolution;->IR_180P:Lcom/szabh/smable3/entity/AIImageResolution;

    sget-object v1, Lcom/szabh/smable3/entity/AIImageResolution;->IR_360P:Lcom/szabh/smable3/entity/AIImageResolution;

    sget-object v2, Lcom/szabh/smable3/entity/AIImageResolution;->IR_480P:Lcom/szabh/smable3/entity/AIImageResolution;

    sget-object v3, Lcom/szabh/smable3/entity/AIImageResolution;->IR_600P:Lcom/szabh/smable3/entity/AIImageResolution;

    sget-object v4, Lcom/szabh/smable3/entity/AIImageResolution;->IR_720P:Lcom/szabh/smable3/entity/AIImageResolution;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/szabh/smable3/entity/AIImageResolution;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/szabh/smable3/entity/AIImageResolution;

    const/4 v1, 0x0

    const-string v2, "240X180"

    const-string v3, "IR_180P"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/szabh/smable3/entity/AIImageResolution;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/szabh/smable3/entity/AIImageResolution;->IR_180P:Lcom/szabh/smable3/entity/AIImageResolution;

    new-instance v0, Lcom/szabh/smable3/entity/AIImageResolution;

    const/4 v1, 0x1

    const-string v2, "480X360"

    const-string v3, "IR_360P"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/szabh/smable3/entity/AIImageResolution;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/szabh/smable3/entity/AIImageResolution;->IR_360P:Lcom/szabh/smable3/entity/AIImageResolution;

    new-instance v0, Lcom/szabh/smable3/entity/AIImageResolution;

    const/4 v1, 0x2

    const-string v2, "640X480"

    const-string v3, "IR_480P"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/szabh/smable3/entity/AIImageResolution;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/szabh/smable3/entity/AIImageResolution;->IR_480P:Lcom/szabh/smable3/entity/AIImageResolution;

    new-instance v0, Lcom/szabh/smable3/entity/AIImageResolution;

    const/4 v1, 0x3

    const-string v2, "800X600"

    const-string v3, "IR_600P"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/szabh/smable3/entity/AIImageResolution;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/szabh/smable3/entity/AIImageResolution;->IR_600P:Lcom/szabh/smable3/entity/AIImageResolution;

    new-instance v0, Lcom/szabh/smable3/entity/AIImageResolution;

    const/4 v1, 0x4

    const-string v2, "960X720"

    const-string v3, "IR_720P"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/szabh/smable3/entity/AIImageResolution;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/szabh/smable3/entity/AIImageResolution;->IR_720P:Lcom/szabh/smable3/entity/AIImageResolution;

    invoke-static {}, Lcom/szabh/smable3/entity/AIImageResolution;->$values()[Lcom/szabh/smable3/entity/AIImageResolution;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/AIImageResolution;->$VALUES:[Lcom/szabh/smable3/entity/AIImageResolution;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/AIImageResolution;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/szabh/smable3/entity/AIImageResolution$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/AIImageResolution$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/AIImageResolution;->Companion:Lcom/szabh/smable3/entity/AIImageResolution$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/szabh/smable3/entity/AIImageResolution;->value:I

    iput-object p4, p0, Lcom/szabh/smable3/entity/AIImageResolution;->label:Ljava/lang/String;

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
            "Lcom/szabh/smable3/entity/AIImageResolution;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/entity/AIImageResolution;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/szabh/smable3/entity/AIImageResolution;
    .locals 1

    const-class v0, Lcom/szabh/smable3/entity/AIImageResolution;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/entity/AIImageResolution;

    return-object p0
.end method

.method public static values()[Lcom/szabh/smable3/entity/AIImageResolution;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/entity/AIImageResolution;->$VALUES:[Lcom/szabh/smable3/entity/AIImageResolution;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/szabh/smable3/entity/AIImageResolution;

    return-object v0
.end method


# virtual methods
.method public final getLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/AIImageResolution;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/AIImageResolution;->value:I

    return v0
.end method

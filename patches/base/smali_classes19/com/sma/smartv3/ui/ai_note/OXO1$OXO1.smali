.class public final Lcom/sma/smartv3/ui/ai_note/OXO1$OXO1;
.super Lcom/sma/smartv3/ui/ai_note/OXO1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/ai_note/OXO1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OXO1"
.end annotation


# static fields
.field public static final OXO1:Lcom/sma/smartv3/ui/ai_note/OXO1$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/ai_note/OXO1$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/ai_note/OXO1$OXO1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/ui/ai_note/OXO1$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai_note/OXO1$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/ai_note/OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/sma/smartv3/ui/ai_note/OXO1$OXO1;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x1dd83fab

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "Error"

    return-object v0
.end method

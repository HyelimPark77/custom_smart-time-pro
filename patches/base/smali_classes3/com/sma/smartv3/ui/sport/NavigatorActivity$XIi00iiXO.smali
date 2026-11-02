.class public final Lcom/sma/smartv3/ui/sport/NavigatorActivity$XIi00iiXO;
.super Lcom/android/mltcode/paycertificationapi/q4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/NavigatorActivity;->initItemView(Lcom/angcyo/dsladapter/DslViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic iO:Lkotlin/jvm/internal/Ref$IntRef;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$IntRef;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$XIi00iiXO;->iO:Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {p0}, Lcom/android/mltcode/paycertificationapi/q4;-><init>()V

    return-void
.end method


# virtual methods
.method public I0IIOi(F)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$XIi00iiXO;->iO:Lkotlin/jvm/internal/Ref$IntRef;

    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-nez v0, :cond_0

    float-to-int p1, p1

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

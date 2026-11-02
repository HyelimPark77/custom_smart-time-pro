.class public final synthetic Lcom/sma/smartv3/ui/sport/OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/sport/NavigatorActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/OXO1;->IO:Lcom/sma/smartv3/ui/sport/NavigatorActivity;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/OXO1;->IO:Lcom/sma/smartv3/ui/sport/NavigatorActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/NavigatorActivity$showData$1;->I0IIOi(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
